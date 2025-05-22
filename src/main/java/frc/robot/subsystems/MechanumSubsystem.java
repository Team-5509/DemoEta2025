// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkClosedLoopController;
import edu.wpi.first.wpilibj.drive.MecanumDrive;



public class MechanumSubsystem extends SubsystemBase {
  private SparkMax frontLeftMotor = new SparkMax(6, MotorType.kBrushless);
  private SparkMax frontRightMotor= new SparkMax(1, MotorType.kBrushless);
  private SparkMax backLeftMotor = new SparkMax(8, MotorType.kBrushless);
  private SparkMax backRightMotor = new SparkMax(13, MotorType.kBrushless);
  private MecanumDrive mecanumDrive;
  /** Creates a new ExampleSubsystem. */
  public MechanumSubsystem() {
    mecanumDrive = new MecanumDrive(frontLeftMotor, backLeftMotor, backRightMotor,backRightMotor);

  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public void drive(double x,double y,double rotation){
    mecanumDrive.driveCartesian(y, x, rotation);
}
}
