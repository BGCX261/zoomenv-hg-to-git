y.createModel('myComp', 'component', 'component', 'component', 'ComponentModel')

def centrifuga = y.create(mc.Component, y.root, 'elements', ['name':'Centrífuga', 'stereotype' : ''])

def gui = y.create(mc.Component, y.root, 'elements', ['name':'LavadoraGUI', 'stereotype' : '«GUI»'])

def iCentrifuga = y.create(mc.Interface, y.root, 'elements', ['name':'InterfazCentrifuga'])


y.create(mc.Dependency, y.root, 'elements', ['src' : gui, 'dst' : iCentrifuga])
