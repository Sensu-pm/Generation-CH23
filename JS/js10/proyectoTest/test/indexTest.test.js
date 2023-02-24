//Prueba efectiva
// const indexTest = require("../calculadora"); Ecma5
import { indexTest} from "../calculadora"; //Ecma6
test('test suma', () => {
       const r = indexTest.suma(1,2);
       expect (r).toBe(3);

})
test.todo('test resta');
test.todo('test multiplicacion');
test.todo('test division');