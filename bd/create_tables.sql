USE biblioteca;

CREATE TABLE usuario (
    id_usuario INT PRIMARY KEY,
    nome VARCHAR(100),
    idade INT,
    endereco VARCHAR(255),
    telefone VARCHAR(20)
);

CREATE TABLE livro (
    id_livro INT PRIMARY KEY,
    titulo VARCHAR(255),
    autor VARCHAR(100),
    ano INT,
    genero VARCHAR(50),
    disponivel BOOLEAN
);

CREATE TABLE emprestimo (
    id_emprestimo INT PRIMARY KEY,
    id_usuario INT,
    id_livro INT,
    data_emprestimo DATE,
    data_devolucao DATE,
    devolvido BOOLEAN,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY (id_livro) REFERENCES livro(id_livro)
);
