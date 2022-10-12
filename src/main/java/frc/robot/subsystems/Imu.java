// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.ADIS16448_IMU;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Imu extends SubsystemBase {
  /** Creates a new Imu. */

  // https://wiki.analog.com/first/adis16448_imu_frc/java
  ADIS16448_IMU imu = new ADIS16448_IMU();
  
  public Imu() {
  }

  // #region IMU Tüm Değerler
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

  public double getBarometricPressure() {
    return imu.getBarometricPressure();
  }

  public double getGyroAngleX() {
    return imu.getGyroAngleX();
  }

  public double getGyroAngleY() {
    return imu.getGyroAngleY();
  }

  public double getGyroAngleZ() {
    return imu.getGyroAngleZ();
  }

  public double getMagneticFieldX() {
    return imu.getMagneticFieldX();
  }

  public double getMagneticFieldY() {
    return imu.getMagneticFieldY();
  }

  public double getMagneticFieldZ() {
    return imu.getMagneticFieldZ();
  }

  public double getTemperature() {
    return imu.getTemperature();
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
    SmartDashboard.putNumber("Imu_Pressure", getBarometricPressure());
    SmartDashboard.putNumber("Gyro_X_Angle", getGyroAngleX());
    SmartDashboard.putNumber("Gyro_Y_Angle", getGyroAngleY());
    SmartDashboard.putNumber("Gyro_Z_Angle", getGyroAngleZ());
    SmartDashboard.putNumber("Magnetic_Field_X", getMagneticFieldX());
    SmartDashboard.putNumber("Magnetic_Field_Y", getMagneticFieldY());
    SmartDashboard.putNumber("Magnetic_Field_Z", getMagneticFieldZ());
    SmartDashboard.putNumber("Tempature", getTemperature());
    SmartDashboard.putNumber("X_Complementary_Angle", getXComplementaryAngle());
    SmartDashboard.putNumber("Y_Complementary_Angle", getYComplementaryAngle());
    SmartDashboard.putNumber("X_Complementary_Angle", getXComplementaryAngle());
    SmartDashboard.putNumber("X_Filtered_Accel_Angle", getXFilteredAccelAngle());
    SmartDashboard.putNumber("Y_Filtered_Accel_Angle", getYFilteredAccelAngle());
  }
}
