// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Encoders extends SubsystemBase {
  Encoder encoder1 = new Encoder(Constants.Encoders.Encoder1.channelA, Constants.Encoders.Encoder1.channelB);
  Encoder encoder2 = new Encoder(Constants.Encoders.Encoder2.channelA, Constants.Encoders.Encoder2.channelB);

  /** Creates a new Encoder. */
  public Encoders() {
    encoder1.setDistancePerPulse(2048);
    encoder2.setDistancePerPulse(2048);
  }

  // Encoder açısı
  public double getDistance1() {
    return encoder1.getDistance();
  }

  public double getDistance2() {
    return encoder1.getDistance();
  }

  // Mevcut hız
  public double getRate1() {
    return encoder1.getRate();
  }

  public double getRate2() {
    return encoder1.getRate();
  }

  public void reset1() {
    encoder1.reset();
  }

  public void reset2() {
    encoder1.reset();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run    
    SmartDashboard.putNumber("Encoder1_Distance", getDistance1());
    SmartDashboard.putNumber("Encoder2_Distance", getDistance2());
  }
}
