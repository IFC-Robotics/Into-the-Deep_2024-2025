package org.firstinspires.ftc.teamcode.competition;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.robot.Robot;

@TeleOp(name="Meet 0", group="Competition")
public class meet0TeleOp extends LinearOpMode {

    int hangHeight = 16680;
    int floorHeight = 20;
    int height;

    @Override
    public void runOpMode() {

        telemetry.addLine("Initializing opMode...");
        telemetry.update();

        Robot.init(this, false);

        Robot.mode = "assist";

        waitForStart();

        telemetry.addLine("Executing opMode...");
        telemetry.update();

        while (opModeIsActive()) {
            Robot.drivetrain.teleOp(-gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x, gamepad1.right_bumper);

            Robot.motorArm.teleOp(gamepad2.left_stick_y, 0);

            Robot.servoCollector.teleOpManualMode(gamepad2.left_bumper,gamepad2.right_bumper);

            Robot.motorHanger.teleOp(gamepad2.right_stick_y, 0);
            if (gamepad2.y) {
                height = hangHeight;
            }
            if (gamepad2.a) {
                height = floorHeight;
            }
            Robot.motorHanger.runToPosition(height);
        }
    }

}

/**
 * Controls
 * Gamepad1:
 * - left Stick: cardinal drivetrain
 * - right Stick: turning
 * - Left & Right Triggers: collector
 * -
 *
 *
 *
 **/
