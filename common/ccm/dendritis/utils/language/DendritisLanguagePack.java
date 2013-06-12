package ccm.dendritis.utils.language;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.common.registry.LanguageRegistry;


import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum.helper.LanguageHelper;
import ccm.nucleum.utils.language.ILanguagePack;

public class DendritisLanguagePack extends ILanguagePack
{

    /**
     * Private {@code List<String>} that contains the languages, Shared with all Language Packs
     */
    private List<String> supportedLanguages = new ArrayList<String>();

    /**
     * Adds all the supported Languages
     */
    public DendritisLanguagePack()
    {
        super(Locations.LANGUAGE_FILE);
        this.supportedLanguages.add(this.getPath("en_US"));
        this.supportedLanguages.add(this.getPath("es_ES"));
    }

    @Override
    public void loadLangs()
    {
        for (final String langFile : this.supportedLanguages){
            LanguageRegistry.instance().loadLocalization(langFile, LanguageHelper.getLangFromFileName(langFile), LanguageHelper.isXMLLanguageFile(langFile));
        }
    }
}