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
        Robot.servoArmL.printData();
        Robot.servoArmR.printData();

        Robot.mode = "assist";

        waitForStart();

        telemetry.addLine("Executing opMode...");
        telemetry.update();

        while (opModeIsActive()) {
            Robot.drivetrain.teleOp(-gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x, gamepad1.right_bumper);

           // Robot.servoCollector.teleOpManualMode(gamepad1.left_bumper, gamepad1.right_bumper);
//            Robot.servoCollector.teleOpAssistMode(gamepad1.left_bumper, false, gamepad1.right_bumper);
            Robot.servoClawL.teleOpAssistMode(gamepad1.left_bumper, gamepad1.right_bumper, gamepad1.x);
            Robot.servoClawR.teleOpAssistMode(gamepad1.x, gamepad1.right_bumper, gamepad1.left_bumper);
            Robot.servoClawL.printData();
            Robot.servoClawR.printData();
            Robot.verticalLiftL.teleOp(-gamepad2.right_stick_y, gamepad2.left_bumper, gamepad1.dpad_down, gamepad1.dpad_up, gamepad2.b, gamepad2.y);
            Robot.verticalLiftR.teleOp(-gamepad2.right_stick_y, gamepad2.left_bumper, gamepad1.dpad_down, gamepad1.dpad_up, gamepad2.b, gamepad2.y);
            Robot.verticalLiftL.printData();
            Robot.verticalLiftR.printData();
            Robot.servoArmL.teleOpAssistMode(gamepad1.left_trigger > 0.2, false, gamepad1.right_trigger > 0.2);
            Robot.servoArmL.printData();
            Robot.servoArmR.teleOpAssistMode(gamepad1.right_trigger > 0.2, false, gamepad1.left_trigger > 0.2);
            Robot.servoArmR.printData();

            Robot.motorHanger.teleOp(gamepad2.right_trigger, -gamepad2.left_trigger);

//            if (gamepad1.y) {
//                height = hangHeight;
//            }
//            if (gamepad1.a) {
//                height = floorHeight;
//            }
//            Robot.motorHanger.runToPosition(height);
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