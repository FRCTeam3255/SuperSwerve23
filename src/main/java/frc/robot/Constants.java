// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.util.Units;

public final class Constants {
  public static class constControllers {
    public static final double DRIVER_LEFT_STICK_DEADBAND = 0.05;
  }

  public static class constDrivetrain {
    // In Degrees: Obtain by aligning all of the wheels in the correct direction and
    // copy-pasting the Raw Absolute Encoder value
    // Comp // Prac
    public static final double FRONT_LEFT_ABS_ENCODER_OFFSET = 17.402344; // 113.906250;
    public static final double FRONT_RIGHT_ABS_ENCODER_OFFSET = 232.294922; // 341.630859;
    public static final double BACK_LEFT_ABS_ENCODER_OFFSET = 87.451172; // 152.490234;
    public static final double BACK_RIGHT_ABS_ENCODER_OFFSET = 333.369141; // 246.09375;

    public static final boolean DRIVE_MOTOR_INVERT = false;
    public static final boolean STEER_MOTOR_INVERT = true;

    public static final NeutralMode DRIVE_NEUTRAL_MODE = NeutralMode.Brake;
    public static final NeutralMode STEER_NEUTRAL_MODE = NeutralMode.Coast;

    public static final double WHEEL_DIAMETER = Units.inchesToMeters(3.8);
    public static final double WHEEL_CIRCUMFERENCE = WHEEL_DIAMETER * Math.PI;

    // L2 gearing, Falcon drive motor
    // https://www.swervedrivespecialties.com/products/mk4i-swerve-module
    public static final double DRIVE_GEAR_RATIO = 6.75;
    public static final double STEER_GEAR_RATIO = 150.0 / 7.0;
    public static final double MAX_MODULE_SPEED = Units.feetToMeters(16.3);

    // Physically measured center to center of the wheel on a
    // 29"x29" drivetrain with MK4i's.
    public static final double TRACK_WIDTH = Units.inchesToMeters(23.75);
    public static final double WHEELBASE = Units.inchesToMeters(23.75);

    // Location of all modules in the WPILib robot coordinate system
    // https://docs.wpilib.org/en/stable/docs/software/advanced-controls/geometry/coordinate-systems.html#robot-coordinate-system
    public static final SwerveDriveKinematics SWERVE_KINEMATICS = new SwerveDriveKinematics(
        new Translation2d(WHEELBASE / 2.0, TRACK_WIDTH / 2.0),
        new Translation2d(WHEELBASE / 2.0, -TRACK_WIDTH / 2.0),
        new Translation2d(-WHEELBASE / 2.0, TRACK_WIDTH / 2.0),
        new Translation2d(-WHEELBASE / 2.0, -TRACK_WIDTH / 2.0));

    public static final boolean AUTO_USE_ALLIANCE_COLOR = true;
  }
}
