// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.ADIS16470_IMU;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Imu extends SubsystemBase {
  /** Creates a new Imu. */

  // https://wiki.analog.com/first/adis16448_imu_frc/java
  ADIS16470_IMU imu = new ADIS16470_IMU();
  
  public Imu() {
  }

  // #region IMU Tüm Değerler
  public void reset() {
    imu.reset();
  }
  
  public double getAngle() {
    return imu.getAngle();
  }

  public double getRate() {
    return imu.getRate();
  }

  public double getAccelX() {
    return imu.getAccelX();
  }

  public double getAccelY() {
    return imu.getAccelY();
  }

  public double getAccelZ() {
    return imu.getAccelZ();
  }

  public double getXComplementaryAngle() {
    return imu.getXComplementaryAngle();
  }

  public double getXFilteredAccelAngle() {
    return imu.getXFilteredAccelAngle();
  }

  public double getYComplementaryAngle() {
    return imu.getYComplementaryAngle();
  }

  public double getYFilteredAccelAngle() {
    return imu.getYFilteredAccelAngle();
  }
  // #endregion

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("ImuAngle", getAngle());
    SmartDashboard.putNumber("ImuRate", getRate());
    SmartDashboard.putNumber("Imu_X_Accel", getAccelX());
    SmartDashboard.putNumber("Imu_Y_Accel", getAccelY());
    SmartDashboard.putNumber("Imu_Z_Accel", getAccelZ());
  }
}
