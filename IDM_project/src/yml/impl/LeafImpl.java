/**
 */
package yml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import yml.Leaf;
import yml.YmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leaf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yml.impl.LeafImpl#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link yml.impl.LeafImpl#getApplicationType <em>Application Type</em>}</li>
 *   <li>{@link yml.impl.LeafImpl#getDatabaseType <em>Database Type</em>}</li>
 *   <li>{@link yml.impl.LeafImpl#getPackageName <em>Package Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeafImpl extends MinimalEObjectImpl.Container implements Leaf {
	/**
	 * The default value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationName()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationName()
	 * @generated
	 * @ordered
	 */
	protected String applicationName = APPLICATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationType()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationType()
	 * @generated
	 * @ordered
	 */
	protected String applicationType = APPLICATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseType() <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseType() <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseType()
	 * @generated
	 * @ordered
	 */
	protected String databaseType = DATABASE_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeafImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YmlPackage.Literals.LEAF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationName(String newApplicationName) {
		String oldApplicationName = applicationName;
		applicationName = newApplicationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.LEAF__APPLICATION_NAME, oldApplicationName, applicationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationType() {
		return applicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationType(String newApplicationType) {
		String oldApplicationType = applicationType;
		applicationType = newApplicationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.LEAF__APPLICATION_TYPE, oldApplicationType, applicationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseType() {
		return databaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseType(String newDatabaseType) {
		String oldDatabaseType = databaseType;
		databaseType = newDatabaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.LEAF__DATABASE_TYPE, oldDatabaseType, databaseType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YmlPackage.LEAF__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YmlPackage.LEAF__APPLICATION_NAME:
				return getApplicationName();
			case YmlPackage.LEAF__APPLICATION_TYPE:
				return getApplicationType();
			case YmlPackage.LEAF__DATABASE_TYPE:
				return getDatabaseType();
			case YmlPackage.LEAF__PACKAGE_NAME:
				return getPackageName();
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
			case YmlPackage.LEAF__APPLICATION_NAME:
				setApplicationName((String)newValue);
				return;
			case YmlPackage.LEAF__APPLICATION_TYPE:
				setApplicationType((String)newValue);
				return;
			case YmlPackage.LEAF__DATABASE_TYPE:
				setDatabaseType((String)newValue);
				return;
			case YmlPackage.LEAF__PACKAGE_NAME:
				setPackageName((String)newValue);
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
			case YmlPackage.LEAF__APPLICATION_NAME:
				setApplicationName(APPLICATION_NAME_EDEFAULT);
				return;
			case YmlPackage.LEAF__APPLICATION_TYPE:
				setApplicationType(APPLICATION_TYPE_EDEFAULT);
				return;
			case YmlPackage.LEAF__DATABASE_TYPE:
				setDatabaseType(DATABASE_TYPE_EDEFAULT);
				return;
			case YmlPackage.LEAF__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
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
			case YmlPackage.LEAF__APPLICATION_NAME:
				return APPLICATION_NAME_EDEFAULT == null ? applicationName != null : !APPLICATION_NAME_EDEFAULT.equals(applicationName);
			case YmlPackage.LEAF__APPLICATION_TYPE:
				return APPLICATION_TYPE_EDEFAULT == null ? applicationType != null : !APPLICATION_TYPE_EDEFAULT.equals(applicationType);
			case YmlPackage.LEAF__DATABASE_TYPE:
				return DATABASE_TYPE_EDEFAULT == null ? databaseType != null : !DATABASE_TYPE_EDEFAULT.equals(databaseType);
			case YmlPackage.LEAF__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
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
		result.append(" (applicationName: ");
		result.append(applicationName);
		result.append(", applicationType: ");
		result.append(applicationType);
		result.append(", databaseType: ");
		result.append(databaseType);
		result.append(", packageName: ");
		result.append(packageName);
		result.append(')');
		return result.toString();
	}

} //LeafImpl
