// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotPreferences.prefDrivetrain;
import frc.robot.subsystems.Drivetrain;

public class DemoSteer extends CommandBase {
  Drivetrain subDrivetrain;
  double rotationDegrees; // Field relative (counter clockwise)

  public DemoSteer(Drivetrain subDrivetrain, double rotationDegrees) {
    this.subDrivetrain = subDrivetrain;
    this.rotationDegrees = rotationDegrees;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    subDrivetrain.rotateToAngle(rotationDegrees, true);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    subDrivetrain.neutralDriveOutputs();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    // End when we are within a range of our desired angle
    return Math.abs(subDrivetrain.getRotation().getDegrees() - rotationDegrees) < prefDrivetrain.steerPIDTolerance
        .getValue();
  }
}
