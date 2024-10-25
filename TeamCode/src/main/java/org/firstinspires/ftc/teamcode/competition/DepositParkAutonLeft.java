package org.firstinspires.ftc.teamcode.competition;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.robot.Robot;

@Autonomous(name="Deposit and Park (far from park side)", group="Competition")
public class DepositParkAutonLeft extends LinearOpMode {

    @Override
    public void runOpMode() {
        Robot.init(this, false);

        waitForStart();
        Robot.drivetrain.strafe(3, 0.5);
        Robot.drivetrain.drive(20,0.6);
        Robot.drivetrain.drive(-6,0.6);
        Robot.drivetrain.strafe(23, 0.5);
        Robot.drivetrain.drive(-100,0.6);
        Robot.drivetrain.strafe(-16,0.5);
    }
}
