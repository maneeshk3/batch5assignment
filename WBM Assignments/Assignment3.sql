
select * from epmdocument where masterwbmsourceidentifier not in (select wbmsourceidentifier from epmdocumentmaster);

select * from epmdocument;

select * from epmdocumentmaster where wbmsourceidentifier not in (select masterwbmsourceidentifier from epmdocument);



select * from ATT EPMDOCUMENT;



select * from ATT EPMDOCUMENT where ibahldrwbmsourceidentifier not in (select womsourceidentifier from epmdocument);



select * from wtdocumentmaster;



select * from wtdocument;



select * from wtdocument where masterwbmsourceidentifier not in (select wbmsourceidentifier from wtdocumentmaster);



select * from wtdocumentmaster where womsourceidentifier not in (select masterwbmsourceidentifier from wtdocument); teamcentre data row shown otherwise no null value.



select * from wtpartmaster;



select * from wtpart;



select * from wtpart where masterwbmsourceidentifier not in (select womsourceidentifier from wtpartmaster);



select * from wtpartmaster where wbmsourceidentifier not in (select masterwbmsourceidentifier from wtpart);



select * from ATT WTPART;



select * from ATT WTPART where ibaholderwbmsourceidentifier not in (select wbmsourceidentifier from wtpart);



select * from Epmdocument;



select * from epmdocumentmaster;



select * from EPMFTPROP;



select * from EPMFTPROP where EPMWBMSOURCEIDENTIFIER not in (select wbmsourceidentifier from epmdocument);



---For NORMALIZATION:



---how to check references issues in links?



select * from epmvariantlink;



INSTDOCWBMSOURCEIDENTIFIER-have null in the column table---epmdocument



GENMASTERWEMSOURCEIDENTIFIER---have null in the column table----epmdocumentmaster



select INSTDOCWBMSOURCEIDENTIFIER from epmvariantlink where INSTDOCWBMSOURCEIDENTIFIER not in (select wbmsourceidentifier from epmdocument);



select GENMASTERWBMSOURCEIDENTIFIER from epmvariantlink where GENMASTERWBMSOURCEIDENTIFIER not in (select wbmsourceidentifier from epmdocumentmaster);

select * from WTDOCUMENTDEPENDENCYLINK;



DESCRIBESWBMSOURCEIDENTIFIER -wtdocument



DESCRIBEDBYWBMSOURCEIDENTIFIER-wtdocument



select DESCRIBESWEMSOURCEIDENTIFIER from WTDOCUMENTDEPENDENCYLINK where DESCRIBESWEMSOURCEIDENTIFIER not in (select womsourceidentifier from wtdocument);



select DESCRIBEDBYWBMSOURCEIDENTIFIER from WTDOCUMENTDEPENDENCYLINK where DESCRIBEDBYWBMSOURCEIDENTIFIER not in (select womsourceidentifier from wtdocument);



select * from WTPARTDESCRIBELINK;



DESCRIBESWBMSOURCEIDENTIFIER----wtpart



DESCRIBEDBYWBMSOURCEIDENTIFIER---wtdocument



select DESCRIBESWBMSOURCEIDENTIFIER from WTPARTDESCRIBELINK where DESCRIBESWBMSOURCEIDENTIFIER not in (select wbmsourceidentifier from wtpart);



select DESCRIBEDBYWBMSOURCEIDENTIFIER from WTPARTDESCRIBELINK where DESCRIBEDBYWBMSOURCEIDENTIFIER not in (select wbmsourceidentifier from wtdocument);



select * from WTPARTREFERENCELINK;



REFDBYWBMSOURCEIDENTIFIER wtpart



REFERENCESWBMSOURCEIDENTIFIER-wtdocumentmaster



select REFDBYWBMSOURCEIDENTIFIER from WTPARTREFERENCELINK where REFDBYWBMSOURCEIDENTIFIER not in (select wbmsourceidentifier from wtpart);



select REFERENCESWBMSOURCEIDENTIFIER from WTPARTREFERENCELINK where REFERENCESWBMSOURCEIDENTIFIER not in (select wbmsourceidentifier from wtdocumentmaster);



select * from WTPARTUSAGELINK_720381313;



USEDBYWBMSOURCEIDENTIFIER ---wtpart



USESWEMSOURCEIDENTIFIER-wtpartmaster



select USEDBYWBMSOURCEIDENTIFIER from WTPARTUSAGELINK_720381313 where USEDBYWBMSOURCEIDENTIFIER not in (select womsourceidentifier from wtpart);



select USESWBMSOURCEIDENTIFIER from WTPARTUSAGELINK 720381313 where USESWBMSOURCEIDENTIFIER not in (select womsourceidentifier from wtpartmaster); ----showing values..



select * from WTPARTSUBSTITUTELINK;



SUBFORWBMSOURCEIDENTIFIER-WTPartUsageLink



SUBSTITUTESWBMSOURCEIDENTIFIER-WTPartMaster



select SUBFORWBMSOURCEIDENTIFIER from WTPARTSUBSTITUTELINK where SUBFORWBMSOURCEIDENTIFIER not in (select wbmsourceidentifier from WTPartUsageLink_720381313);



select SUBSTITUTESWBMSOURCEIDENTIFIER from WTPARTSUBSTITUTELINK where SUBSTITUTESWBMSOURCEIDENTIFIER not in (select womsourceidentifier from WTPartMaster);

select * from epmvariantlink;



INSTDOCWBMSOURCEIDENTIFIER-have null in the column table---epmdocument



GENMASTERWEMSOURCEIDENTIFIER---have null in the column table----epmdocumentmaster



select INSTDOCWBMSOURCEIDENTIFIER from epmvariantlink where INSTDOCWBMSOURCEIDENTIFIER not in (select wbmsourceidentifier from epmdocument);



select GENMASTERWBMSOURCEIDENTIFIER from epmvariantlink where GENMASTERWBMSOURCEIDENTIFIER not in (select womsourceidentifier from epmdocumentmaster);



select * from EPMMEMBERLINK;



USEDBYWBMSOURCEIDENTIFIER---epmdocument



USESWBMSOURCEIDENTIFIER--epmdocumentmaster



select USEDBYWBMSOURCEIDENTIFIER from EPMMEMBERLINK where USEDBYWBMSOURCEIDENTIFIER not in (select womsourceidentifier from epmdocument);



select USESWBMSOURCEIDENTIFIER from EPMMEMBERLINK where USESWBMSOURCEIDENTIFIER not in (select womsourceidentifier from epmdocumentmaster);



select * from EPMREFERENCELINK;



REFDBYWBMSOURCEIDENTIFIER---epmdocument



REFERENCESWBMSOURCEIDENTIFIER---epmdocumentmaster



select REFDBYWBMSOURCEIDENTIFIER from EPMREFERENCELINK where REFDBYWBMSOURCEIDENTIFIER not in (select womsourceidentifier from epmdocument);



select REFERENCESWBMSOURCEIDENTIFIER from EPMREFERENCELINK where REFERENCESWBMSOURCEIDENTIFIER not in (select wbmsourceidentifier from epmdocumentmaster)



select * from EPMDESCRIBELINK;



DESCRIBESWBMSOURCEIDENTIFIER -WTPart



DESCRIBEDBYWBMSOURCEIDENTIFIER-EPMDocument



select DESCRIBESWBMSOURCEIDENTIFIER from EPMDESCRIBELINK where DESCRIBESWBMSOURCEIDENTIFIER not in (select wbmsourceidentifier from wtpart);



select DESCRIBEDBYWBMSOURCEIDENTIFIER from EPMDESCRIBELINK where DESCRIBEDBYWBMSOURCEIDENTIFIER not in (select wbmsourceidentifier from epmdocument);



select * from WTDOCUMENTDEPENDENCYLINK;



DESCRIBESWBMSOURCEIDENTIFIER-wtdocument



DESCRIBEDBYWBMSOURCEIDENTIFIER wtdocument



select DESCRIBESWBMSOURCEIDENTIFIER from WTDOCUMENTDEPENDENCYLINK where DESCRIBESWBMSOURCEIDENTIFIER not in (select womsourceidentifier from wtdocument);



select DESCRIBEDBYWBMSOURCEIDENTIFIER from WTDOCUMENTDEPENDENCYLINK where DESCRIBEDBYWBMSOURCEIDENTIFIER not in (select womsourceidentifier from wtdocume:



select * from WTPARTDESCRIBELINK;



DESCRIBESWBMSOURCEIDENTIFIER-wtpart



DESCRIBEDBYWBMSOURCEIDENTIFIER---wt.document



select DESCRIBESWBMSOURCEIDENTIFIER from WTPARTDESCRIBELINK where DESCRIBESWBMSOURCEIDENTIFIER not in (select wbmsourceidentifier from wtpart);



select DESCRIBEDBYWBMSOURCEIDENTIFIER from WTPARTDESCRIBELINK where DESCRIBEDBYWBMSOURCEIDENTIFIER not in (select wbmsourceidentifier from wtdocument);
