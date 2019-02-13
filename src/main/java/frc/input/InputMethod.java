/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.input;

/**
 * Operator controls for the robot
 */
public abstract class InputMethod {
  public double forwardAmount() {
    return 0;
  }

  public double turnAmount() {
    return 0;
  }

  public boolean shouldPivotUp() {
    return false;
  }

  public boolean shouldPivotDown() {
    return false;
  }

  public boolean shouldIntake() {
    return false;
  }

  public boolean shouldOuttake() {
    return false;
  }
}