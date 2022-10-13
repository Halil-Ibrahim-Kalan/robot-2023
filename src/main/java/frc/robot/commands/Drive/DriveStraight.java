// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Drive;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Encoders;
import frc.robot.subsystems.Imu;

public class DriveStraight extends CommandBase {
  /** Creates a new GoStraight. */
  double kP = 0.005; // propotional turning constant
  double kPForward = 0.5;
  double kAngleSetpoint = 0.0;
  double encoderSetpoint = 0;
  double encoderDistance = 0;
  Imu imu;
  Drive drive;
  Encoders encoders;
  boolean isFinished = false;

  public DriveStraight(Imu imu, Drive drive, Encoders encoders) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.imu = imu;
    this.drive = drive;
    this.encoders = encoders;
    addRequirements(this.imu, this.drive, this.encoders);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    imu.reset();
    encoders.reset1();
    encoders.reset2();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double turningValue = -imu.getAngle() * kP; // dönme açısı

    if (encoders.getDistance1() - encoderDistance <= 10) {
      if(turningValue <=  0.05 && turningValue >= -0.05) {
        encoderSetpoint = encoders.getDistance1(); // encoder değerimizi çekiyoruz
        drive.arcadeDrive(0.5, 0); // dümdüz gittik
        // abi dumduz yardiriyo bir sey degismeyince
      }
      else {
        encoderDistance = encoders.getDistance1() - encoderSetpoint;
        drive.arcadeDrive(0, turningValue);
        // agaaa vurulduk duzelt ife gir tekrar
      }
    }
    else {
      isFinished = true;
      //mitti beyler mitti
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drive.arcadeDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return isFinished;
  }
}
