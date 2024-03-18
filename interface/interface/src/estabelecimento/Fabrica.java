package estabelecimento;

import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		Impressora impressora = new Deskjet();
		Impressora impressoraLaser = new Laserjet();
		EquipamentoMultifuncional multifuncional = new EquipamentoMultifuncional();
		
		impressora.imprimir();
		impressoraLaser.imprimir();
		multifuncional.imprimir();
		multifuncional.copiar();
		multifuncional.digitalizar();
	}
}