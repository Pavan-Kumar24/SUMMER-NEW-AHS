/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


 
public class Controls extends Joystick {
    //Axis
    private static final int AXIS_LEFT_X = 0;
    private static final int AXIS_LEFT_Y = 1;
    private static final int AXIS_SHOULDER_L = 2;
	private static final int AXIS_SHOULDER_R = 3;
	private static final int AXIS_RIGHT_X = 4;
    private static final int AXIS_RIGHT_Y = 5;
    // creates Joystick Object
    public Controls(int Controlport) {
        super(Controlport);
    }
// Returns X position of the left stick
    public double getLeftX() {
        return getRawAxis(AXIS_LEFT_X);
    }
    public double getRightX() {
        return getRawAxis(AXIS_RIGHT_X);
    }

// Returns Y pos of the left stick
    public double getLeftY() {
        return getRawAxis(AXIS_LEFT_Y);
    }
   // Returns Y of the right stick 
    public double getRightY() {
        return getRawAxis(AXIS_RIGHT_Y);
    }
    public double getLeftTrigger() {
		return getRawAxis(AXIS_SHOULDER_L);
	}
	
	public double getRightTrigger() {
		return getRawAxis(AXIS_SHOULDER_R);
    }

}