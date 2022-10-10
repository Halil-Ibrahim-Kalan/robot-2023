// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Encoders extends SubsystemBase {
  Encoder encoder = new Encoder(Constants.Encoder.channelA, Constants.Encoder.channelB);
  ShuffleboardTab tab = Shuffleboard.getTab("ENCODER");

  /** Creates a new Encoder. */
  public Encoders() {
    encoder.setDistancePerPulse(2048);
  }

  // Encoder açısı
  public double getDistance() {
    return encoder.getDistance();
  }

  // Mevcut hız
  public double getRate() {
    return encoder.getRate();
  }

  public void reset() {
    encoder.reset();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    tab.add("Distance", getDistance());
    tab.add("Rate", getRate());
  }
}
