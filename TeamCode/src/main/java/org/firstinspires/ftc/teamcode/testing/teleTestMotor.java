package org.firstinspires.ftc.teamcode.testing;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.robot.MotorClass;
import org.firstinspires.ftc.teamcode.robot.Robot;
import org.firstinspires.ftc.teamcode.robot.ServoClass;


@TeleOp(name="Test Teleop", group="Linear Opmode")

public class teleTestMotor extends LinearOpMode {

    // Declare OpMode members.
    private static MotorClass motor;
    private static ServoClass servo;
    private double servoPosition;

    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Initialize the hardware variables
        motor  = new MotorClass("motor", 0.5, 800, false);
        servo  = new ServoClass("servo", "high", 0, "middle",0.5 ,"low",0.8, 0.01, 800, false);

        motor.init(this);
        servo.init(this);

        // Wait for the turn to start (driver presses PLAY)
        waitForStart();

        while (opModeIsActive()) {
            // run forward when pressing a and backward when pressing b
            motor.teleOp(gamepad1.right_stick_y, gamepad1.left_stick_y);
            servo.teleOpManualMode(gamepad1.a,gamepad1.b);
//            telemetry.addData("ga: ", servo.servo.getPosition());
            telemetry.update();
//
//            motor.printData();
//            servo.printData();
//            telemetry.update();
        }
    }
}
