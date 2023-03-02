package src.personal.model;

public class RepositoryFileJson extends RepositoryFile{

    private UserMapper mapper = new UserMapperJson();
    private FileOperation fileOperation;

    public RepositoryFileJson(FileOperation fileOperation, Mapper mapper, UserMapper mapper1, FileOperation fileOperation1) {
        super(fileOperation, mapper);
        this.mapper = mapper1;
        this.fileOperation = fileOperation1;
    }

    public RepositoryFileJson(FileOperation fileOperation, UserMapper userMapper) {
        super(fileOperation, userMapper);
        this.fileOperation = fileOperation;
    }
}
