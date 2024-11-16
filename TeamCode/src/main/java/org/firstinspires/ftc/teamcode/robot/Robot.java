package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.Telemetry;
//robot uses the different classes in this code so if you need specifics look at the class
public class Robot {
    //a log (pretty much console.log)
    public static Telemetry telemetry;
    //
    public static Drivetrain drivetrain;
    //
    public static LiftClass verticalLift;
    public static ServoClass servoArmL;
    public static ServoClass servoArmR;
    public static ServoClass servoCollector;

    public static MotorClass motorArm;
    public static MotorClass motorHanger;
//    public static MotorClass motorPulley;



    public static double MAX_LIFT_SPEED = 0.3;
    public static double MAX_MOTOR_SPEED = 0.7;
    public static double SERVO_SPEED = 0.01;
    public static int SERVO_TIME = 800;
    public static int CR_SERVO_TIME = 1600;
    public static int SLEEP_TIME = 50;

    public static String mode = "assist";


    // initialize

    public static void init(LinearOpMode opMode, boolean onlyDrive) {

        telemetry = opMode.telemetry;

        telemetry.addLine("initializing robot class...");
        telemetry.update();


        drivetrain     = new Drivetrain("collector", SLEEP_TIME);
        drivetrain.init(opMode);

        if (onlyDrive == false) {
            verticalLift =   new LiftClass("motor_vertical_lift", MAX_LIFT_SPEED, 0.0005, SLEEP_TIME, false);
//            servoLR  =     new ServoClass("servo_left_right", "left", 0.2, "middle",0.5,"right", 0.8, SERVO_SPEED, SERVO_TIME, false);
            servoArmL =      new ServoClass("servo_arm_left", "up", 0, "middle",0.3 ,"down",0.347, SERVO_SPEED, SERVO_TIME, false);
            servoArmR =      new ServoClass("servo_arm_right", "down", 0.03, "middle",0.05 ,"up",0.35, SERVO_SPEED, SERVO_TIME, false);
            servoCollector = new ServoClass("servo_collector", "open", 0, "middle",0.5 ,"closed",0.8, SERVO_SPEED, SERVO_TIME, false);
//            motorArm       = new MotorClass("motor_arm", 0.5*MAX_MOTOR_SPEED, SLEEP_TIME, true);
            motorHanger =    new MotorClass("motor_hanger", MAX_MOTOR_SPEED, SLEEP_TIME, false);
//            motorPulley =       new MotorClass("motor_pulley", MAX_MOTOR_SPEED,SLEEP_TIME, false);

            verticalLift.init(opMode);
            servoArmL.init(opMode);
            servoArmR.init(opMode);

            servoCollector.init(opMode);
//            motorArm.init(opMode);
            motorHanger.init(opMode);
//            motorPulley.init(opMode);
        }


//

    }

    //April Tag Methods





}