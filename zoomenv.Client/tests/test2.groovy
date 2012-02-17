y.createModel('m', 'ecore', 'http://www.eclipse.org/emf/2002/Ecore', 't', 'EPackage')

def lavadora = y.create(mc.EPackage, y.root, 'eSubpackages', ['name':'lavadora'])
	def Lavadora = y.create(mc.EClass,lavadora,'eClassifiers', ['name':'Lavadora'])
		y.create(mc.EAttribute, Lavadora, 'eStructuralFeatures', ['name' : 'modelo', 'eType' : mc.EString])
		y.create(mc.EAttribute, Lavadora, 'eStructuralFeatures', ['name' : 'marca', 'eType' : mc.EString])
	def Centrifuga = y.create(mc.EClass,lavadora,'eClassifiers', ['name':'Centrifuga'])
		y.create(mc.EAttribute, Centrifuga, 'eStructuralFeatures', ['name' : 'rpm', 'eType' : mc.EInt])
	y.create(mc.EReference, Lavadora, 'eStructuralFeatures', ['name' : 'centrifuga', 'eType' : Centrifuga])

def acciones = y.create(mc.EPackage, y.root, 'eSubpackages', ['name':'acciones'])
	def AccionLavado = y.create(mc.EClass,acciones,'eClassifiers', ['name':'AccionLavado'])
		y.create(mc.EAttribute, AccionLavado, 'eStructuralFeatures', ['name' : 'nombre', 'eType' : mc.EString])


y.create(mc.EReference, Lavadora, 'eStructuralFeatures', ['name' : 'programa', 'eType' : AccionLavado, 'upperBound' : -1])


