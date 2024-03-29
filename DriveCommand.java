package frc.robot.commands;

import java.sql.Driver;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.command.Command;

import frc.robot.DRIVER;;

public class DriveCommand extends Command {
  DoubleSupplier throttle;
  DoubleSupplier turn;
  public DriveCommand(DoubleSupplier throttle,DoubleSupplier turn) {

     // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    this.turn = turn;
    this.throttle = throttle;
    requires(DRIVER.drive);
  }

// Called just before this Command runs the first time
@Override
protected void initialize() {
}

// Called repeatedly when this Command is scheduled to run
@Override
protected void execute() {
  DRIVER.drive.tank(throttle.getAsDouble(), turn.getAsDouble());
}

//  // Make this return true when this Command no longer needs to run execute()
@Override
protected boolean isFinished() {
  return false;
}
// Called once after isFinished returns true
@Override
protected void end() {
}

// Called when another command which requires one or more of the same
// subsystems is scheduled to run
@Override
protected void interrupted() {
}
}


