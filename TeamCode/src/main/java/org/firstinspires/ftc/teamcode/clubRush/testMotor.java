package org.firstinspires.ftc.teamcode.clubRush;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;


@Autonomous(name="Test motor", group="Linear Opmode")
@Disabled
public class testMotor extends LinearOpMode {

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor armMotor;

    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Initialize the hardware variables
        armMotor  = hardwareMap.get(DcMotor.class, "arm_motor");

        // Wait for the turn to start (driver presses PLAY)
        waitForStart();
        runtime.reset();

        // run for 1 seconds
        while (true) {
            armMotor.setPower(0.2);
        }
    }
}
