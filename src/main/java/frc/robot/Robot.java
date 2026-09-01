// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.subsystems.Intake;

/**
 * The methods in this class are called automatically corresponding to each mode, as described in
 * the TimedRobot documentation. If you change the name of this class or the package after creating
 * this project, you must also update the Main.java file in the project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
   public Robot() {}
   
   
   @Override
   public void robotInit() {
     Intake.close();
   }



  @Override
  public void robotPeriodic() {
    System.out.println("current state: " + Intake.getState());
  }

  @Override
  public void autonomousInit() {
    System.out.println("Autonomous mode started"); //one time
    Intake.open();
  }

  @Override
  public void autonomousPeriodic() {
    System.out.println("Autonomous mode periodic"); //0.2 loop
  }

  @Override
  public void teleopInit() {
    System.out.println("Teleoperated mode started");
    Intake.close();
    
  }

  @Override
  public void teleopPeriodic() {}

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
