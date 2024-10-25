package org.firstinspires.ftc.teamcode.competition;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.robot.Robot;

@Autonomous(name="Deposit and Park", group="Competition")
public class DepositParkAuton extends LinearOpMode {

    @Override
    public void runOpMode() {
        Robot.init(this, false);

        waitForStart();
        Robot.drivetrain.drive(24,0.7);
        Robot.drivetrain.strafe(10, 0.5);
        Robot.drivetrain.drive(-48,0.7);
        Robot.drivetrain.strafe(-10,0.5);
    }
}
