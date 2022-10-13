// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Drive;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Encoders;
import frc.robot.subsystems.Imu;

public class GoStraight extends CommandBase {
  /** Creates a new GoStraight. */
  double kP = 0.005; // propotional turning constant
  double kAngleSetpoint = 0.0;
  Imu imu;
  Drive drive;
  Encoders encoders;
  boolean isFinished = false;

  public GoStraight(Imu imu, Drive drive, Encoders encoders) {
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
    double average = (encoders.getDistance1() + encoders.getDistance2()) / 2;  
    double turningValue = (kAngleSetpoint - imu.getAngle()) * kP;
    
    if ( average <= 10) {
      drive.arcadeDrive(0.5, turningValue);
    } else {
      isFinished = true;
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
