/**
 */
package test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.Application#getConfig <em>Config</em>}</li>
 *   <li>{@link test.Application#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference list.
	 * The list contents are of type {@link test.Config}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference list.
	 * @see test.TestPackage#getApplication_Config()
	 * @model containment="true"
	 * @generated
	 */
	EList<Config> getConfig();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link test.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see test.TestPackage#getApplication_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntity();

} // Application
