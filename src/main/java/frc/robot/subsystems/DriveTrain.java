/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DriverControls;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  private Spark motorLeft1 = new Spark(RobotMap.MOTOR_LEFT_1_ID);
  private Spark motorLeft2 = new Spark(RobotMap.MOTOR_LEFT_2_ID);
  private Spark motorRight1 = new Spark(RobotMap.MOTOR_RIGHT_1_ID);
  private Spark motorRight2 = new Spark(RobotMap.MOTOR_RIGHT_2_ID);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriverControls());
  }

  public void setLeftMotors(double speed) {
    motorLeft1.set(speed);
    motorLeft2.set(speed);
  }

  public void setRightMotors(double speed) {
    motorRight1.set(-speed);
    motorRight2.set(-speed);
  }

}
