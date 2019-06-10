/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import frc.robot.OI;
import frc.robot.Constants;
import frc.robot.commands.DriveCommand;

public class Drivetrain extends Subsystem {

  DifferentialDrive drive;

  public VictorSP rightmaster = new VictorSP(Constants.rightMotor);
  public VictorSP leftmaster = new VictorSP(Constants.leftMotor);

  public Drivetrain(){
    drive = new DifferentialDrive(leftmaster, rightmaster);
  }
 
 





public void tank(double left, double right)
{
drive.tankDrive(left, right);
}

@Override
public void initDefaultCommand() {

  setDefaultCommand(new DriveCommand(OI.throttle,OI.turn));
 }
}
