package org.firstinspires.ftc.teamcode;

/**
 * Created by nill on 1/9/18.
 */

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import static org.firstinspires.ftc.teamcode.BILAutonomousCommon.Color.*;
import static org.firstinspires.ftc.teamcode.BILAutonomousCommon.Side.*;

@Autonomous(name="Autonomous Red", group="BIL")
public class BILAutonomousRed extends BILAutonomousCommon
{
    @Override public void runOpMode() throws InterruptedException {
        boolean rightMovement = false;
        boolean leftMovement = false;

        robot.init(hardwareMap);
        loadObjects();

        robot.colorSensor.enableLed(true);

        waitForStart();

        robot.leftGrabber.setPosition(0.8);

        robot.jewelArm.setPosition(0.0);

        delay(2000);

        telemetry.addData("Red", robot.colorSensor.red());
        telemetry.addData("Blue", robot.colorSensor.blue());
        telemetry.update();

//        if(robot.colorSensor.red() > robot.colorSensor.blue()){ //left side red
//
//            setDriveMotors(0.5, 0.5, -0.5, -0.5);
//            rightMovement = true;
//        } else if(robot.colorSensor.blue() > robot.colorSensor.red()) { //right side is red
//
//            setDriveMotors(-0.5, -0.5, 0.5, 0.5);
//            leftMovement = true;
//        }


        Color left = detectLeft();

        if(left == RED) {
            knockJewelSide(LEFT);
        } else if(left == BLUE) {
            knockJewelSide(RIGHT);
        }
        //setDriveMotors(0.5, -0.5, -0.5, 0.5);

        delay(2000);

        //parkSafe(false);
        parkSimple(RED);
    }
}
