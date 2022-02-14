/**
 */
package yml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yml.Leaf#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link yml.Leaf#getApplicationType <em>Application Type</em>}</li>
 *   <li>{@link yml.Leaf#getDatabaseType <em>Database Type</em>}</li>
 *   <li>{@link yml.Leaf#getPackageName <em>Package Name</em>}</li>
 * </ul>
 *
 * @see yml.YmlPackage#getLeaf()
 * @model
 * @generated
 */
public interface Leaf extends EObject {
	/**
	 * Returns the value of the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Name</em>' attribute.
	 * @see #setApplicationName(String)
	 * @see yml.YmlPackage#getLeaf_ApplicationName()
	 * @model
	 * @generated
	 */
	String getApplicationName();

	/**
	 * Sets the value of the '{@link yml.Leaf#getApplicationName <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Name</em>' attribute.
	 * @see #getApplicationName()
	 * @generated
	 */
	void setApplicationName(String value);

	/**
	 * Returns the value of the '<em><b>Application Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Type</em>' attribute.
	 * @see #setApplicationType(String)
	 * @see yml.YmlPackage#getLeaf_ApplicationType()
	 * @model
	 * @generated
	 */
	String getApplicationType();

	/**
	 * Sets the value of the '{@link yml.Leaf#getApplicationType <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Type</em>' attribute.
	 * @see #getApplicationType()
	 * @generated
	 */
	void setApplicationType(String value);

	/**
	 * Returns the value of the '<em><b>Database Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Type</em>' attribute.
	 * @see #setDatabaseType(String)
	 * @see yml.YmlPackage#getLeaf_DatabaseType()
	 * @model
	 * @generated
	 */
	String getDatabaseType();

	/**
	 * Sets the value of the '{@link yml.Leaf#getDatabaseType <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Type</em>' attribute.
	 * @see #getDatabaseType()
	 * @generated
	 */
	void setDatabaseType(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see yml.YmlPackage#getLeaf_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link yml.Leaf#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

} // Leaf
