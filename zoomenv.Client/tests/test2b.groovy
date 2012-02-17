y.createModel('sm', 'stateMachine', 'stateMachine', 'smt', 'StateMachine')

i1 = y.create(mc.InitialState, y.root, 'childStates', ['name':'i1'])
f1 = y.create(mc.FinalState, y.root, 'childStates', ['name':'f1'])

funcionando = y.create(mc.State, y.root, 'childStates', ['name':'funcionando'])
lavando = y.create(mc.State, funcionando, 'childStates', ['name':'lavando'])
enjuagando = y.create(mc.State, funcionando, 'childStates', ['name':'enjuagando'])
centrifugando = y.create(mc.State, funcionando, 'childStates', ['name':'centrifugando'])
apagada = y.create(mc.State, y.root, 'childStates', ['name':'apagando'])


y.create(mc.Transition, y.root, 'childTransitions', ['name' : 'iniciaLavado', 'states' : [i1,lavando] ]) 
y.create(mc.Transition, y.root, 'childTransitions', ['name' : 'lavadoTerminado', 'states' : [lavando,enjuagando] ]) 
y.create(mc.Transition, y.root, 'childTransitions', ['name' : 'enjuagueTerminado', 'states' : [enjuagando,centrifugando] ]) 
y.create(mc.Transition, y.root, 'childTransitions', ['name' : 'centrifugadoTerminado', 'states' : [centrifugando,f1] ]) 
y.create(mc.Transition, y.root, 'childTransitions', ['name' : 'oprimeOff', 'states' : [funcionando,apagada] ]) 
y.create(mc.Transition, y.root, 'childTransitions', ['name' : 'fin', 'states' : [apagada,f1] ])
