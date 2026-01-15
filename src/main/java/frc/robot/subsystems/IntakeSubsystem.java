package frc.robot.subsystems;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;

//import edu.wpi.first.math.geometry.Rotation2d;
//import edu.wpi.first.math.kinematics.SwerveModuleState;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.ScoringConstants;


public class IntakeSubsystem extends SubsystemBase {
    private final SparkFlex m_turningMotor;
    private final boolean isRunning = false;

    public IntakeSubsystem() {
        m_turningMotor = new SparkFlex(ScoringConstants.kScoringTurningCanId, MotorType.kBrushless);
    }

    public void setMotor() {
        m_turningMotor.set(isRunning ? ScoringConstants.kMotorSpeed : 0);
    }
}