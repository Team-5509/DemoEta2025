package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;


public class SpinForever extends Command {
  private final ShooterSubsystem shooter;
  public SpinForever(ShooterSubsystem shooter) {
    this.shooter = shooter;
    addRequirements(shooter);
  }
  @Override public void initialize() { 
    shooter.setPercent(0.6);
 }
  @Override public boolean isFinished() { return false; }
}