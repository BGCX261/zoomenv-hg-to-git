y.createModel('mydfd', 'dfd', 'dfd', 'dfdt', 'DFD')

SistemaLavadora = y.create(mc.Process, y.root, 'childNodes', ['name':'SistemaLavadora'])
Lavar = y.create(mc.Process, SistemaLavadora, 'childNodes', ['name':'Lavar'])
Programar = y.create(mc.Process, SistemaLavadora, 'childNodes', ['name':'Programar'])
BDPrograma = y.create(mc.DataStore, SistemaLavadora, 'childNodes', ['name':'BDPrograma']) 
Usuario = y.create(mc.ExternalEntity, y.root, 'childNodes', ['name':'Usuario'])

y.create(mc.DataFlow, y.root, 'childDataFlows', ['name' : 'programa', 'nodes' : [Usuario,Programar] ])
y.create(mc.DataFlow, y.root, 'childDataFlows', ['name' : 'programa', 'nodes' : [Programar,BDPrograma] ])
y.create(mc.DataFlow, y.root, 'childDataFlows', ['name' : 'accionPrograma', 'nodes' : [BDPrograma,Lavar] ])
y.create(mc.DataFlow, y.root, 'childDataFlows', ['name' : 'notificacionFin', 'nodes' : [Lavar,Usuario] ]) 
