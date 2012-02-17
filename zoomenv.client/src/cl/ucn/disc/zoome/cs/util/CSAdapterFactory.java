/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cl.ucn.disc.zoome.cs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

import cl.ucn.disc.zoome.cs.CSColor;
import cl.ucn.disc.zoome.cs.CSConnection;
import cl.ucn.disc.zoome.cs.CSConnectionEnd;
import cl.ucn.disc.zoome.cs.CSElement;
import cl.ucn.disc.zoome.cs.CSLayout;
import cl.ucn.disc.zoome.cs.CSNode;
import cl.ucn.disc.zoome.cs.CSPackage;
import cl.ucn.disc.zoome.cs.CSPoint;
import cl.ucn.disc.zoome.cs.CSRoot;
import cl.ucn.disc.zoome.cs.CSShape;
import cl.ucn.disc.zoome.cs.CSStroke;
import cl.ucn.disc.zoome.cs.CSTemplateDescription;
import cl.ucn.disc.zoome.cs.CSText;
import cl.ucn.disc.zoome.cs.CSTransform;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cl.ucn.disc.zoome.cs.CSPackage
 * @generated
 */
public class CSAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CSPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CSPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSSwitch<Adapter> modelSwitch =
		new CSSwitch<Adapter>() {
			@Override
			public Adapter caseCSRoot(CSRoot object) {
				return createCSRootAdapter();
			}
			@Override
			public Adapter caseCSElement(CSElement object) {
				return createCSElementAdapter();
			}
			@Override
			public Adapter caseCSNode(CSNode object) {
				return createCSNodeAdapter();
			}
			@Override
			public Adapter caseCSConnection(CSConnection object) {
				return createCSConnectionAdapter();
			}
			@Override
			public Adapter caseCSText(CSText object) {
				return createCSTextAdapter();
			}
			@Override
			public Adapter caseCSStroke(CSStroke object) {
				return createCSStrokeAdapter();
			}
			@Override
			public Adapter caseCSColor(CSColor object) {
				return createCSColorAdapter();
			}
			@Override
			public Adapter caseCSShape(CSShape object) {
				return createCSShapeAdapter();
			}
			@Override
			public Adapter caseCSPoint(CSPoint object) {
				return createCSPointAdapter();
			}
			@Override
			public Adapter caseCSTransform(CSTransform object) {
				return createCSTransformAdapter();
			}
			@Override
			public Adapter caseCSTemplateDescription(CSTemplateDescription object) {
				return createCSTemplateDescriptionAdapter();
			}
			@Override
			public Adapter caseCSLayout(CSLayout object) {
				return createCSLayoutAdapter();
			}
			@Override
			public Adapter caseCSConnectionEnd(CSConnectionEnd object) {
				return createCSConnectionEndAdapter();
			}
			@Override
			public Adapter caseEModelElement(EModelElement object) {
				return createEModelElementAdapter();
			}
			@Override
			public Adapter caseENamedElement(ENamedElement object) {
				return createENamedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cl.ucn.disc.zoome.cs.CSRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cl.ucn.disc.zoome.cs.CSRoot
	 * @generated
	 */
	public Adapter createCSRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cl.ucn.disc.zoome.cs.CSElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cl.ucn.disc.zoome.cs.CSElement
	 * @generated
	 */
	public Adapter createCSElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cl.ucn.disc.zoome.cs.CSNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cl.ucn.disc.zoome.cs.CSNode
	 * @generated
	 */
	public Adapter createCSNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cl.ucn.disc.zoome.cs.CSConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cl.ucn.disc.zoome.cs.CSConnection
	 * @generated
	 */
	public Adapter createCSConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cl.ucn.disc.zoome.cs.CSText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cl.ucn.disc.zoome.cs.CSText
	 * @generated
	 */
	public Adapter createCSTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cl.ucn.disc.zoome.cs.CSStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cl.ucn.disc.zoome.cs.CSStroke
	 * @generated
	 */
	public Adapter createCSStrokeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cl.ucn.disc.zoome.cs.CSColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cl.ucn.disc.zoome.cs.CSColor
	 * @generated
	 */
	public Adapter createCSColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cl.ucn.disc.zoome.cs.CSShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cl.ucn.disc.zoome.cs.CSShape
	 * @generated
	 */
	public Adapter createCSShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cl.ucn.disc.zoome.cs.CSPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cl.ucn.disc.zoome.cs.CSPoint
	 * @generated
	 */
	public Adapter createCSPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cl.ucn.disc.zoome.cs.CSTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cl.ucn.disc.zoome.cs.CSTransform
	 * @generated
	 */
	public Adapter createCSTransformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cl.ucn.disc.zoome.cs.CSTemplateDescription <em>Template Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cl.ucn.disc.zoome.cs.CSTemplateDescription
	 * @generated
	 */
	public Adapter createCSTemplateDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cl.ucn.disc.zoome.cs.CSLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cl.ucn.disc.zoome.cs.CSLayout
	 * @generated
	 */
	public Adapter createCSLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cl.ucn.disc.zoome.cs.CSConnectionEnd <em>Connection End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cl.ucn.disc.zoome.cs.CSConnectionEnd
	 * @generated
	 */
	public Adapter createCSConnectionEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.ENamedElement
	 * @generated
	 */
	public Adapter createENamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CSAdapterFactory
