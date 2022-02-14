/**
 */
package yml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see yml.YmlFactory
 * @model kind="package"
 * @generated
 */
public interface YmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "yml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ymluri";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "yml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YmlPackage eINSTANCE = yml.impl.YmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link yml.impl.LeafImpl <em>Leaf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yml.impl.LeafImpl
	 * @see yml.impl.YmlPackageImpl#getLeaf()
	 * @generated
	 */
	int LEAF = 0;

	/**
	 * The feature id for the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__APPLICATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Application Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__APPLICATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Database Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__DATABASE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__PACKAGE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link yml.Leaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf</em>'.
	 * @see yml.Leaf
	 * @generated
	 */
	EClass getLeaf();

	/**
	 * Returns the meta object for the attribute '{@link yml.Leaf#getApplicationName <em>Application Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Name</em>'.
	 * @see yml.Leaf#getApplicationName()
	 * @see #getLeaf()
	 * @generated
	 */
	EAttribute getLeaf_ApplicationName();

	/**
	 * Returns the meta object for the attribute '{@link yml.Leaf#getApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Type</em>'.
	 * @see yml.Leaf#getApplicationType()
	 * @see #getLeaf()
	 * @generated
	 */
	EAttribute getLeaf_ApplicationType();

	/**
	 * Returns the meta object for the attribute '{@link yml.Leaf#getDatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Type</em>'.
	 * @see yml.Leaf#getDatabaseType()
	 * @see #getLeaf()
	 * @generated
	 */
	EAttribute getLeaf_DatabaseType();

	/**
	 * Returns the meta object for the attribute '{@link yml.Leaf#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see yml.Leaf#getPackageName()
	 * @see #getLeaf()
	 * @generated
	 */
	EAttribute getLeaf_PackageName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	YmlFactory getYmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link yml.impl.LeafImpl <em>Leaf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yml.impl.LeafImpl
		 * @see yml.impl.YmlPackageImpl#getLeaf()
		 * @generated
		 */
		EClass LEAF = eINSTANCE.getLeaf();

		/**
		 * The meta object literal for the '<em><b>Application Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF__APPLICATION_NAME = eINSTANCE.getLeaf_ApplicationName();

		/**
		 * The meta object literal for the '<em><b>Application Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF__APPLICATION_TYPE = eINSTANCE.getLeaf_ApplicationType();

		/**
		 * The meta object literal for the '<em><b>Database Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF__DATABASE_TYPE = eINSTANCE.getLeaf_DatabaseType();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF__PACKAGE_NAME = eINSTANCE.getLeaf_PackageName();

	}

} //YmlPackage
