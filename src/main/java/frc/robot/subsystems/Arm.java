/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.OperatorControls;
import edu.wpi.first.wpilibj.Spark;

/**
 * Add your docs here.
 */
public class Arm extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private Spark armMotor = new Spark(RobotMap.ARM_MOTOR_ID);
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new OperatorControls());
  }

public void setArmMotor(double speed){
  armMotor.set(speed);
}

}
