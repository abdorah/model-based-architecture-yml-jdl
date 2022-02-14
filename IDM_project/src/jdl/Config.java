/**
 */
package jdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdl.Config#getBaseName <em>Base Name</em>}</li>
 *   <li>{@link jdl.Config#getAppType <em>App Type</em>}</li>
 *   <li>{@link jdl.Config#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link jdl.Config#getDataBaseType <em>Data Base Type</em>}</li>
 * </ul>
 *
 * @see jdl.JdlPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Name</em>' attribute.
	 * @see #setBaseName(String)
	 * @see jdl.JdlPackage#getConfig_BaseName()
	 * @model unique="false"
	 * @generated
	 */
	String getBaseName();

	/**
	 * Sets the value of the '{@link jdl.Config#getBaseName <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Name</em>' attribute.
	 * @see #getBaseName()
	 * @generated
	 */
	void setBaseName(String value);

	/**
	 * Returns the value of the '<em><b>App Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Type</em>' attribute.
	 * @see #setAppType(String)
	 * @see jdl.JdlPackage#getConfig_AppType()
	 * @model unique="false"
	 * @generated
	 */
	String getAppType();

	/**
	 * Sets the value of the '{@link jdl.Config#getAppType <em>App Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Type</em>' attribute.
	 * @see #getAppType()
	 * @generated
	 */
	void setAppType(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see jdl.JdlPackage#getConfig_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link jdl.Config#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Data Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Base Type</em>' attribute.
	 * @see #setDataBaseType(String)
	 * @see jdl.JdlPackage#getConfig_DataBaseType()
	 * @model unique="false"
	 * @generated
	 */
	String getDataBaseType();

	/**
	 * Sets the value of the '{@link jdl.Config#getDataBaseType <em>Data Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Base Type</em>' attribute.
	 * @see #getDataBaseType()
	 * @generated
	 */
	void setDataBaseType(String value);

} // Config
