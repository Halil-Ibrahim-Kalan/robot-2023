// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.ADIS16448_IMU;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Imu extends SubsystemBase {
  /** Creates a new Imu. */

  // https://wiki.analog.com/first/adis16448_imu_frc/java
  ADIS16448_IMU imu = new ADIS16448_IMU();
  ShuffleboardTab tab = Shuffleboard.getTab("IMU");
  public Imu() {
  }

  // #region IMU all values
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
    Shuffleboard.getTab("IMU").add("Angle", getAngle());
    Shuffleboard.getTab("IMU").add("Rate", getRate());
    Shuffleboard.getTab("IMU").add("X_Accel", getAccelX());
    Shuffleboard.getTab("IMU").add("Y_Accel", getAccelY());
    Shuffleboard.getTab("IMU").add("Z_Accel", getAccelZ());
    Shuffleboard.getTab("IMU").add("Barometric_Pressure", getBarometricPressure());
    Shuffleboard.getTab("IMU").add("X_Gyro_Angle", getGyroAngleX());
    Shuffleboard.getTab("IMU").add("Y_Gyro_Angle", getGyroAngleY());
    Shuffleboard.getTab("IMU").add("Z_Gyro_Angle", getGyroAngleZ());
    Shuffleboard.getTab("IMU").add("X_Magnetic_Field", getMagneticFieldX());
    Shuffleboard.getTab("IMU").add("Y_Magnetic_Field", getMagneticFieldY());
    Shuffleboard.getTab("IMU").add("Z_Magnetic_Field", getMagneticFieldZ());
    Shuffleboard.getTab("IMU").add("Tempature", getTemperature());
    Shuffleboard.getTab("IMU").add("X_Complemantary_Angle", getXComplementaryAngle());
    Shuffleboard.getTab("IMU").add("Y_Complemantary_Angle", getYComplementaryAngle());
    Shuffleboard.getTab("IMU").add("X_Filtered_Accel_Angle", getXFilteredAccelAngle());
    Shuffleboard.getTab("IMU").add("Y_Filtered_Accel_Angle", getYFilteredAccelAngle());
  }
}
