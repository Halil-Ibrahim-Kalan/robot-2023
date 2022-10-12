// Copyrotate (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Drive;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;

public class JoystickDrive extends CommandBase {
  /** Creates a new JoystickDrive. */
  private final Drive drive;
  private final DoubleSupplier forward;
  private final DoubleSupplier rotate;

  public JoystickDrive(Drive drive, DoubleSupplier forward, DoubleSupplier rotate) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.drive = drive;
    this.forward = forward;
    this.rotate = rotate;
    addRequirements(this.drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drive.arcadeDrive(forward.getAsDouble(), rotate.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
