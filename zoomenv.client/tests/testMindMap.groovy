y.createModel('myMM', 'mindMap', 'mindMap', 'mindMap', 'MindMap')

def lavadora = y.create(mc.RootIdea, y.root, 'ideas', ['name':'lavadora'])

def esUna = y.create(mc.Idea, y.root, 'ideas', ['name':'es una'])

def maquina = y.create(mc.Idea, y.root, 'ideas', ['name':'máquina'])


y.create(mc.Association, y.root, 'associations', ['src' : lavadora, 'dst' : esUna])
y.create(mc.Association, y.root, 'associations', ['src' : esUna, 'dst' : maquina])


def requiere = y.create(mc.Idea, y.root, 'ideas', ['name':'requiere'])

def agua = y.create(mc.Idea, y.root, 'ideas', ['name':'agua'])

def detergente = y.create(mc.Idea, y.root, 'ideas', ['name':'detergente'])

def ropa = y.create(mc.Idea, y.root, 'ideas', ['name':'ropa'])

def electricidad = y.create(mc.Idea, y.root, 'ideas', ['name':'electricidad'])

y.create(mc.Association, y.root, 'associations', ['src' : lavadora, 'dst' : requiere])

y.create(mc.Association, y.root, 'associations', ['src' : requiere, 'dst' : agua])
y.create(mc.Association, y.root, 'associations', ['src' : requiere, 'dst' : detergente])
y.create(mc.Association, y.root, 'associations', ['src' : requiere, 'dst' : ropa])
y.create(mc.Association, y.root, 'associations', ['src' : requiere, 'dst' : electricidad])


