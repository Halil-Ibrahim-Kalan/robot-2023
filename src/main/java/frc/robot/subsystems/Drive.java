// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drive extends SubsystemBase {
  /** Creates a new Drive. */
  private final PWMTalonSRX left = new PWMTalonSRX(Constants.Driver.left);
  private final PWMTalonSRX right = new PWMTalonSRX(Constants.Driver.right);
  private final DifferentialDrive drive = new DifferentialDrive(left, right);

  public Drive() {
    // left.setInverted(true); // motoru tersine dönderme
    // right.setInverted(true);
  }

  public void arcadeDrive(double forward, double rotate){
    drive.arcadeDrive(forward, rotate);
  }

  public void tankDrive(double left, double right){
    drive.tankDrive(left, right);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
