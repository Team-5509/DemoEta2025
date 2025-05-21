package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.spark.SparkLowLevel.MotorType;

public class ShooterSubsystem extends SubsystemBase {
  private final SparkMax shooterMotor = new SparkMax(5, MotorType.kBrushless);

  public ShooterSubsystem() {

  }
  /**
   * 
   * @param pct should be in between -1 and 1 represeting a percent.
   */
  public void setPercent(double pct) {
    shooterMotor.set(pct);
  }

}