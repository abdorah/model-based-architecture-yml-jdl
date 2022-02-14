/**
 */
package jdl;

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
 *   <li>{@link jdl.Application#getConfig <em>Config</em>}</li>
 *   <li>{@link jdl.Application#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see jdl.JdlPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(Config)
	 * @see jdl.JdlPackage#getApplication_Config()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Config getConfig();

	/**
	 * Sets the value of the '{@link jdl.Application#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(Config value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link jdl.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see jdl.JdlPackage#getApplication_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntity();

} // Application
