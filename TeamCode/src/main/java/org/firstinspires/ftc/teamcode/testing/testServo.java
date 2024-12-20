package org.firstinspires.ftc.teamcode.testing;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;


@Autonomous(name="Test servo auton", group="Linear Opmode")

public class testServo extends LinearOpMode {

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private Servo ServoL;
    private Servo ServoR;

    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Initialize the hardware variables
        ServoL  = hardwareMap.get(Servo.class, "servo_arm_left");
        ServoR  = hardwareMap.get(Servo.class, "servo_arm_right");
        ServoL.setPosition(0.1);
        ServoR.setPosition(0.4);

        // Wait for the turn to start (driver presses PLAY)
        waitForStart();

        // run to a position
        while (opModeIsActive()) {
            ServoL.setPosition(0.35);
            ServoR.setPosition(0.05);
        }

    }
}