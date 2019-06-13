package loja;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

	@RequestMapping("api/pedidos")
	public String listaPedido(){	
		return "Lista de Pedido";		
	}	
	@RequestMapping(value="/api/pedidos/{id}", method=RequestMethod.GET)
	public String pedido(@PathVariable("id") Long id) {
		return "Retorna um unico pedido";
	}
	@RequestMapping(value="/api/pedidos/{id}", method=RequestMethod.DELETE)
	public String deletePedido(@PathVariable("id") Long id) {	
		return "Deleta Pedido";
	}
	@RequestMapping(value="/api/pedidos/{id}", method=RequestMethod.PUT)
	public String updatePedido(@PathVariable("id") Long id, @RequestParam String nome) {			
		return "Altera Pedido";
	}
	@RequestMapping(value="/api/pedidos/{id}", method=RequestMethod.POST)
	public String criaPedido(@PathVariable("id") Long id, @RequestParam String nome) {			
		return "Cria Pedido";
	}
	

}
