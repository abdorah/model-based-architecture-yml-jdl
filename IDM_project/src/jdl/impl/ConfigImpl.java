/**
 */
package jdl.impl;

import jdl.Config;
import jdl.JdlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jdl.impl.ConfigImpl#getBaseName <em>Base Name</em>}</li>
 *   <li>{@link jdl.impl.ConfigImpl#getAppType <em>App Type</em>}</li>
 *   <li>{@link jdl.impl.ConfigImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link jdl.impl.ConfigImpl#getDataBaseType <em>Data Base Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigImpl extends MinimalEObjectImpl.Container implements Config {
	/**
	 * The default value of the '{@link #getBaseName() <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseName() <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseName()
	 * @generated
	 * @ordered
	 */
	protected String baseName = BASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppType() <em>App Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppType()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppType() <em>App Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppType()
	 * @generated
	 * @ordered
	 */
	protected String appType = APP_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataBaseType() <em>Data Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBaseType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_BASE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataBaseType() <em>Data Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBaseType()
	 * @generated
	 * @ordered
	 */
	protected String dataBaseType = DATA_BASE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdlPackage.Literals.CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseName() {
		return baseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseName(String newBaseName) {
		String oldBaseName = baseName;
		baseName = newBaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__BASE_NAME, oldBaseName, baseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppType() {
		return appType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppType(String newAppType) {
		String oldAppType = appType;
		appType = newAppType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__APP_TYPE, oldAppType, appType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataBaseType() {
		return dataBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataBaseType(String newDataBaseType) {
		String oldDataBaseType = dataBaseType;
		dataBaseType = newDataBaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__DATA_BASE_TYPE, oldDataBaseType, dataBaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JdlPackage.CONFIG__BASE_NAME:
				return getBaseName();
			case JdlPackage.CONFIG__APP_TYPE:
				return getAppType();
			case JdlPackage.CONFIG__PACKAGE_NAME:
				return getPackageName();
			case JdlPackage.CONFIG__DATA_BASE_TYPE:
				return getDataBaseType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JdlPackage.CONFIG__BASE_NAME:
				setBaseName((String)newValue);
				return;
			case JdlPackage.CONFIG__APP_TYPE:
				setAppType((String)newValue);
				return;
			case JdlPackage.CONFIG__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case JdlPackage.CONFIG__DATA_BASE_TYPE:
				setDataBaseType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JdlPackage.CONFIG__BASE_NAME:
				setBaseName(BASE_NAME_EDEFAULT);
				return;
			case JdlPackage.CONFIG__APP_TYPE:
				setAppType(APP_TYPE_EDEFAULT);
				return;
			case JdlPackage.CONFIG__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case JdlPackage.CONFIG__DATA_BASE_TYPE:
				setDataBaseType(DATA_BASE_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JdlPackage.CONFIG__BASE_NAME:
				return BASE_NAME_EDEFAULT == null ? baseName != null : !BASE_NAME_EDEFAULT.equals(baseName);
			case JdlPackage.CONFIG__APP_TYPE:
				return APP_TYPE_EDEFAULT == null ? appType != null : !APP_TYPE_EDEFAULT.equals(appType);
			case JdlPackage.CONFIG__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case JdlPackage.CONFIG__DATA_BASE_TYPE:
				return DATA_BASE_TYPE_EDEFAULT == null ? dataBaseType != null : !DATA_BASE_TYPE_EDEFAULT.equals(dataBaseType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (baseName: ");
		result.append(baseName);
		result.append(", appType: ");
		result.append(appType);
		result.append(", packageName: ");
		result.append(packageName);
		result.append(", dataBaseType: ");
		result.append(dataBaseType);
		result.append(')');
		return result.toString();
	}

} //ConfigImpl
