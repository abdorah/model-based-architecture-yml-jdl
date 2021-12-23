/**
 */
package test;

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
 *   <li>{@link test.Config#getBaseName <em>Base Name</em>}</li>
 *   <li>{@link test.Config#getAppType <em>App Type</em>}</li>
 *   <li>{@link test.Config#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link test.Config#getDataBase <em>Data Base</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getConfig()
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
	 * @see test.TestPackage#getConfig_BaseName()
	 * @model unique="false" dataType="test.BaseName"
	 * @generated
	 */
	String getBaseName();

	/**
	 * Sets the value of the '{@link test.Config#getBaseName <em>Base Name</em>}' attribute.
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
	 * @see test.TestPackage#getConfig_AppType()
	 * @model unique="false" dataType="test.AppType"
	 * @generated
	 */
	String getAppType();

	/**
	 * Sets the value of the '{@link test.Config#getAppType <em>App Type</em>}' attribute.
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
	 * @see test.TestPackage#getConfig_PackageName()
	 * @model dataType="test.PackageName"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link test.Config#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Data Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Base</em>' attribute.
	 * @see #setDataBase(String)
	 * @see test.TestPackage#getConfig_DataBase()
	 * @model unique="false" dataType="test.DataBaseName"
	 * @generated
	 */
	String getDataBase();

	/**
	 * Sets the value of the '{@link test.Config#getDataBase <em>Data Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Base</em>' attribute.
	 * @see #getDataBase()
	 * @generated
	 */
	void setDataBase(String value);

} // Config
