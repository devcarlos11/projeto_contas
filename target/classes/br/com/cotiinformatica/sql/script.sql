create table usuario(
	idusuario		serial			primary key,
	nome			varchar(100)	not null,
	email			varchar(50)		not null unique,
	senha			varchar(40)		not null
);

create table conta (
		idConta		serial			primary key,
		nome		varchar(50)		not null,
		data		date			not null,
		valor		decimal (10,2)	not null,
		tipo		integer		 	not null check (tipo = 1 or tipo = 2),
		descricao	varchar(500)	not null,
		idUsuario	integer			not null,
		foreign key(idusuario)
			references usuario(idusuario));