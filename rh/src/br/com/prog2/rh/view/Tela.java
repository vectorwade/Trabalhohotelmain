package br.com.prog2.rh.view;

import java.util.ArrayList;
import br.com.prog2.rh.model.Chale;
import br.com.prog2.rh.model.Cliente;
import br.com.prog2.rh.model.Hospedagem;
import br.com.prog2.rh.controller.ChaleController;
import br.com.prog2.rh.controller.ClienteController;
import br.com.prog2.rh.controller.HospedagemController;

public class Tela extends javax.swing.JFrame {

	ArrayList<Cliente> ListaCli;
	ArrayList<Chale> ListaChale;
	ArrayList<Hospedagem> ListaHosp;

	
	public Tela() {
		initComponents();
		ListaCli = new ArrayList<Cliente>();
		ListaChale = new ArrayList<Chale>();
		ListaHosp = new ArrayList<Hospedagem>();
	}

	
	@SuppressWarnings("unchecked")
	private void initComponents() {

		jPanel2 = new javax.swing.JPanel();
		jLabel27 = new javax.swing.JLabel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel3 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		txtCodChale = new javax.swing.JTextField();
		txtLocalizacao = new javax.swing.JTextField();
		txtCapacidade = new javax.swing.JTextField();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		txtValorAltaEst = new javax.swing.JTextField();
		txtValorBaixaEst = new javax.swing.JTextField();
		btnSalvarChale = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		txtNomeCliente = new javax.swing.JTextField();
		txtRG = new javax.swing.JTextField();
		txtEndereco = new javax.swing.JTextField();
		txtBairro = new javax.swing.JTextField();
		txtCidade = new javax.swing.JTextField();
		txtEstado = new javax.swing.JTextField();
		txtCEP = new javax.swing.JTextField();
		txtDataNasc = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		btnSalvarCliente4 = new javax.swing.JButton();
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		txtCodCliente = new javax.swing.JTextField();
		jLabel29 = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		jLabel16 = new javax.swing.JLabel();
		txtCodChale2 = new javax.swing.JTextField();
		jLabel17 = new javax.swing.JLabel();
		txtCodHospedagem = new javax.swing.JTextField();
		jLabel18 = new javax.swing.JLabel();
		txtEstadoHosp = new javax.swing.JTextField();
		jLabel19 = new javax.swing.JLabel();
		txtQuantPessoas = new javax.swing.JTextField();
		jLabel20 = new javax.swing.JLabel();
		txtSaida = new javax.swing.JTextField();
		jLabel21 = new javax.swing.JLabel();
		txtEntrada = new javax.swing.JTextField();
		jLabel22 = new javax.swing.JLabel();
		txtDesconto = new javax.swing.JTextField();
		jLabel23 = new javax.swing.JLabel();
		txtValorFinal = new javax.swing.JTextField();
		jLabel24 = new javax.swing.JLabel();
		btnSalvarHospedagem = new javax.swing.JButton();

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));

		jLabel27.setText("Dados Pessoais ");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel10.setText("CHAL�");

		jLabel11.setText("C�digo:");

		jLabel12.setText("Localiza��o:");

		jLabel13.setText("capacidade:");

		txtCodChale.setBackground(new java.awt.Color(204, 204, 204));

		txtLocalizacao.setBackground(new java.awt.Color(204, 204, 204));

		txtCapacidade.setBackground(new java.awt.Color(204, 204, 204));

		jLabel14.setText("Valor alta esta��o:");

		jLabel15.setText("Valor baixa esta��o:");

		txtValorAltaEst.setBackground(new java.awt.Color(204, 204, 204));

		txtValorBaixaEst.setBackground(new java.awt.Color(204, 204, 204));

		btnSalvarChale.setText("Salvar");
		btnSalvarChale.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSalvarChaleActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup().addGap(412, 412, 412).addComponent(jLabel10))
						.addGroup(jPanel3Layout.createSequentialGroup().addGap(139, 139, 139).addGroup(jPanel3Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(txtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel15).addComponent(jLabel14).addComponent(jLabel13)
												.addComponent(jLabel12).addComponent(jLabel11))
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel3Layout.createSequentialGroup().addGap(29, 29, 29)
														.addComponent(txtCodChale,
																javax.swing.GroupLayout.PREFERRED_SIZE, 300,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout
														.createSequentialGroup()
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel3Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(txtCapacidade,
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 300,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(txtValorAltaEst,
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 300,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(txtValorBaixaEst,
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 300,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))))))
						.addContainerGap(280, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE).addComponent(btnSalvarChale).addGap(397, 397, 397)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(19, 19, 19).addComponent(jLabel10)
						.addGap(49, 49, 49)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtCodChale, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel11))
						.addGap(18, 18, 18)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel12))
						.addGap(22, 22, 22)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel13))
						.addGap(18, 18, 18)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtValorAltaEst, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel14))
						.addGap(24, 24, 24)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtValorBaixaEst, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel15))
						.addGap(18, 18, 18).addComponent(btnSalvarChale).addContainerGap(162, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Chal�", jPanel3);

		txtNomeCliente.setBackground(new java.awt.Color(204, 204, 204));
		txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNomeClienteActionPerformed(evt);
			}
		});

		txtRG.setBackground(new java.awt.Color(204, 204, 204));

		txtEndereco.setBackground(new java.awt.Color(204, 204, 204));
		txtEndereco.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtEnderecoActionPerformed(evt);
			}
		});

		txtBairro.setBackground(new java.awt.Color(204, 204, 204));

		txtCidade.setBackground(new java.awt.Color(204, 204, 204));
		txtCidade.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtCidadeActionPerformed(evt);
			}
		});

		txtEstado.setBackground(new java.awt.Color(204, 204, 204));

		txtCEP.setBackground(new java.awt.Color(204, 204, 204));

		txtDataNasc.setBackground(new java.awt.Color(204, 204, 204));
		txtDataNasc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtDataNascActionPerformed(evt);
			}
		});

		jLabel2.setText("Nome:");

		jLabel4.setText("Endere�o:");

		jLabel5.setText("Bairro:");

		jLabel6.setText("Cidade:");

		jLabel7.setText("Estado:");

		jLabel8.setText("CEP:");

		jLabel9.setText("Data de nasc.:");

		jLabel3.setText("RG:");

		btnSalvarCliente4.setText("Salvar");
		btnSalvarCliente4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSalvarCliente4ActionPerformed(evt);
			}
		});

		jLabel25.setText("CLIENTE");

		jLabel26.setText("Dados Pessoais ");

		jLabel28.setText("Dados Localiza��o ");

		txtCodCliente.setBackground(new java.awt.Color(204, 204, 204));

		jLabel29.setText("C�digo:");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(
						jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout
										.createSequentialGroup().addGap(66, 66, 66).addComponent(
												jLabel1)
										.addGap(140, 140, 140)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(jLabel4).addComponent(jLabel5,
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel6,
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel7,
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel8,
																		javax.swing.GroupLayout.Alignment.LEADING))
												.addComponent(jLabel28).addComponent(jLabel29)
												.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel9).addComponent(jLabel3)
														.addComponent(jLabel2))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.CENTER)
																.addComponent(txtRG,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 300,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(txtDataNasc,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 300,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(txtNomeCliente,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 300,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(btnSalvarCliente4)
																.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
																		jPanel1Layout.createSequentialGroup()
																				.addGap(117, 117, 117)
																				.addComponent(jLabel25))
																.addComponent(txtCodCliente,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 300,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(txtEndereco,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 300,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(txtBairro,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 300,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(txtCidade,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 300,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(txtEstado,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 300,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(txtCEP,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 300,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addComponent(jLabel26))
										.addContainerGap(272, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(128, Short.MAX_VALUE)
						.addComponent(jLabel1).addGap(370, 370, 370))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(jLabel25)
						.addGap(14, 14, 14).addComponent(jLabel26).addGap(28, 28, 28)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel9).addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel29))
						.addGap(28, 28, 28).addComponent(jLabel28)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel4))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel6))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel7))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel8))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(btnSalvarCliente4).addGap(41, 41, 41)));

		jTabbedPane1.addTab(" Cliente", jPanel1);

		jLabel16.setText("HOSPEDAGEM");

		txtCodChale2.setBackground(new java.awt.Color(204, 204, 204));

		jLabel17.setText("C�d. Chal�:");

		txtCodHospedagem.setBackground(new java.awt.Color(204, 204, 204));

		jLabel18.setText("C�d. hosp.:");

		txtEstadoHosp.setBackground(new java.awt.Color(204, 204, 204));

		jLabel19.setText("Estado:");

		txtQuantPessoas.setBackground(new java.awt.Color(204, 204, 204));

		jLabel20.setText("Entrada:");

		txtSaida.setBackground(new java.awt.Color(204, 204, 204));

		jLabel21.setText("Quant. de Pessoas:");

		txtEntrada.setBackground(new java.awt.Color(204, 204, 204));

		jLabel22.setText("Sa�da:");

		txtDesconto.setBackground(new java.awt.Color(204, 204, 204));
		txtDesconto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtDescontoActionPerformed(evt);
			}
		});

		jLabel23.setText("Desconto:");

		txtValorFinal.setBackground(new java.awt.Color(204, 204, 204));

		jLabel24.setText("ValorFinal:");

		btnSalvarHospedagem.setText("Salvar");
		btnSalvarHospedagem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSalvarHospedagemActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(391, 391, 391).addComponent(jLabel16).addGap(0,
						0, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel4Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnSalvarHospedagem).addGap(399, 399, 399))
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(157, 157, 157).addGroup(jPanel4Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
								.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel4Layout.createSequentialGroup().addComponent(jLabel17)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(txtCodChale2, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout
												.createSequentialGroup().addComponent(jLabel19)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(txtEstadoHosp, javax.swing.GroupLayout.PREFERRED_SIZE,
														300, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout
												.createSequentialGroup().addComponent(jLabel18)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(txtCodHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE,
														300, javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(278, 278, 278))
						.addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel21)
								.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel22))
								.addComponent(jLabel20).addComponent(jLabel23)).addGap(18, 18, 18)
								.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel4Layout.createSequentialGroup()
												.addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, Short.MAX_VALUE))
										.addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(txtQuantPessoas, javax.swing.GroupLayout.PREFERRED_SIZE,
														300, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(txtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(txtValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE,
														300, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(232, 279, Short.MAX_VALUE)))))));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(17, 17, 17).addComponent(jLabel16)
						.addGap(44, 44, 44)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtCodChale2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel17))
						.addGap(18, 18, 18)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtCodHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel18))
						.addGap(18, 18, 18)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtEstadoHosp, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel19))
						.addGap(18, 18, 18)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtQuantPessoas, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel21))
						.addGap(18, 18, 18)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel20))
						.addGap(15, 15, 15)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtSaida, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel22))
						.addGap(18, 18, 18)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel23))
						.addGap(14, 14, 14)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel24))
						.addGap(18, 18, 18).addComponent(btnSalvarHospedagem).addContainerGap(60, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Hospedagem", jPanel4);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 866,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtEnderecoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtEnderecoActionPerformed

	private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCidadeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtCidadeActionPerformed

	private void txtDataNascActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDataNascActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtDataNascActionPerformed

	private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNomeClienteActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtNomeClienteActionPerformed

	private void btnSalvarCliente4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarCliente4ActionPerformed
		// TODO add your handling code here:
		Cliente c = new Cliente(Integer.parseInt(txtCodCliente.getText()), txtNomeCliente.getText(),
				Integer.parseInt(txtRG.getText()), txtEndereco.getText(), txtBairro.getText(), txtCidade.getText(),
				txtEstado.getText(), (txtCEP.getText()), txtDataNasc.getText());
		ClienteController cc = new ClienteController();
		cc.inserir(c);
	}// GEN-LAST:event_btnSalvarCliente4ActionPerformed

	private void btnSalvarChaleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarChaleActionPerformed
		// TODO add your handling code here:
		Chale Ca = new Chale(Integer.parseInt(txtCodChale.getText()), txtLocalizacao.getText(),
				Integer.parseInt(txtCapacidade.getText()), Float.parseFloat(txtValorAltaEst.getText()),
				Float.parseFloat(txtValorBaixaEst.getText()));
		ChaleController dd = new ChaleController();
		dd.inserir(Ca);
	}// GEN-LAST:event_btnSalvarChaleActionPerformed

	private void btnSalvarHospedagemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarHospedagemActionPerformed
		// TODO add your handling code here:
		Hospedagem Hp = new Hospedagem(Integer.parseInt(txtCodHospedagem.getText()),
				Integer.parseInt(txtCodChale2.getText()), txtEstadoHosp.getText(), txtEntrada.getText(),
				txtSaida.getText(), Integer.parseInt(txtQuantPessoas.getText()),
				Float.parseFloat(txtDesconto.getText()), Float.parseFloat(txtValorFinal.getText()));
		HospedagemController hh = new HospedagemController();
		hh.inserir(Hp);
	}// GEN-LAST:event_btnSalvarHospedagemActionPerformed

	private void txtDescontoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDescontoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtDescontoActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Tela().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnSalvarChale;
	private javax.swing.JButton btnSalvarCliente4;
	private javax.swing.JButton btnSalvarHospedagem;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField txtBairro;
	private javax.swing.JTextField txtCEP;
	private javax.swing.JTextField txtCapacidade;
	private javax.swing.JTextField txtCidade;
	private javax.swing.JTextField txtCodChale;
	private javax.swing.JTextField txtCodChale2;
	private javax.swing.JTextField txtCodCliente;
	private javax.swing.JTextField txtCodHospedagem;
	private javax.swing.JTextField txtDataNasc;
	private javax.swing.JTextField txtDesconto;
	private javax.swing.JTextField txtEndereco;
	private javax.swing.JTextField txtEntrada;
	private javax.swing.JTextField txtEstado;
	private javax.swing.JTextField txtEstadoHosp;
	private javax.swing.JTextField txtLocalizacao;
	private javax.swing.JTextField txtNomeCliente;
	private javax.swing.JTextField txtQuantPessoas;
	private javax.swing.JTextField txtRG;
	private javax.swing.JTextField txtSaida;
	private javax.swing.JTextField txtValorAltaEst;
	private javax.swing.JTextField txtValorBaixaEst;
	private javax.swing.JTextField txtValorFinal;
	
}
