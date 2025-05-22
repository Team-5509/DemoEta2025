// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.RobotContainer;
import frc.robot.subsystems.MechanumSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class DriveCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final MechanumSubsystem m_subsystem;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public DriveCommand(MechanumSubsystem subsystem) {
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    double y = (-1)*RobotContainer.getInstance().getDriverController().getLeftY();
    double x = (-1)*RobotContainer.getInstance().getDriverController().getLeftX();
    double rotation = (-1)*RobotContainer.getInstance().getDriverController().getRightX();
    double finnese = 1;
    double delinerization = 3;
    double deadband = .2;
    if (y < deadband){
      y = 0;
    }
    if (x < deadband){
      x = 0;
    }
    if (rotation < deadband){
      rotation = 0;
    }
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
