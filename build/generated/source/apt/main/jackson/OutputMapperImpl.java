package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

import java.util.List;

import javax.annotation.Generated;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2017-03-22T22:40:16+0800",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"

)

public class OutputMapperImpl extends OutputMapper {

    @Override

    public DbxOutput outputConfToDbxOutput(OutputConf conf) {

        if ( conf == null ) {

            return null;
        }

        DbxOutput dbxOutput = new DbxOutput();

        try {

            List<OutputMapping> list = stringToList( conf.getMappings() );

            if ( list != null ) {

                dbxOutput.setCustomized_mappings( list );
            }
        }

        catch ( IOException e ) {

            throw new RuntimeException( e );
        }

        dbxOutput.setName( conf.getName() );

        return dbxOutput;
    }

    @Override

    public OutputConf dbxOutputToOutputConf(DbxOutput conf) {

        if ( conf == null ) {

            return null;
        }

        OutputConf outputConf = new OutputConf();

        try {

            outputConf.setMappings( listToSTring( conf.getCustomized_mappings() ) );
        }

        catch ( JsonProcessingException e ) {

            throw new RuntimeException( e );
        }

        outputConf.setName( conf.getName() );

        return outputConf;
    }
}

